/**
 * 
 */
package caching;

import java.util.concurrent.ConcurrentMap;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.JoinConfig;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.NetworkConfig;
import com.hazelcast.config.TcpIpConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

/**
 * @author naveen
 *
 * @date 04-Sep-2017
 */
public class HazelcastConfig {

	public ConcurrentMap<String, String> tabletMetricsUpdatedMap() {
		ConcurrentMap<String, String> tabletMetricsUpdatedMap = hazelcastInstance().getMap("tabletMetricsUpdatedMap");

		MapConfig mapConfig = hazelcastInstance().getConfig().getMapConfig("tabletMetricsUpdatedMap");
		mapConfig.setMaxIdleSeconds(4);
		mapConfig.setTimeToLiveSeconds(4);
		mapConfig.setEvictionPolicy(EvictionPolicy.LRU);

		return tabletMetricsUpdatedMap;
	}

	public HazelcastInstance hazelcastInstance() {
		return Hazelcast.newHazelcastInstance(hazelcastConfig());
	}

	private Config hazelcastConfig() {
		Config config = new Config();

		NetworkConfig networkConfig = getNetworkConfig(config);
		setJoinConfig(networkConfig);

		return config;
	}

	private void setJoinConfig(NetworkConfig networkConfig) {
		JoinConfig joinConfig = networkConfig.getJoin();
		joinConfig.getMulticastConfig().setEnabled(false);

		setTcpConfig(joinConfig);
	}

	private void setTcpConfig(JoinConfig joinConfig) {
		TcpIpConfig tcpIpConfig = joinConfig.getTcpIpConfig();

		tcpIpConfig.setEnabled(true);
		tcpIpConfig
				.addMember("localhost");
	}

	private NetworkConfig getNetworkConfig(Config config) {
		NetworkConfig networkConfig = config.getNetworkConfig();
		networkConfig.setPort(5701).setPortCount(4);
		networkConfig.setPortAutoIncrement(true);

		return networkConfig;
	}

}