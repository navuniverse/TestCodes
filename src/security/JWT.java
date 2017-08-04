/**
 * 
 */
package security;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import org.jose4j.base64url.Base64;
import org.jose4j.jws.JsonWebSignature;

/**
 * @author naveen
 *
 * @date 02-Aug-2017
 */
public class JWT {

	public static void main(String[] args) {

		JsonWebSignature jws = new JsonWebSignature();

		try {

			String token =
					"eyJhbGciOiJSUzI1NiJ9.eyJfaWQiOiJuYXZlZW4iLCJlbWFpbCI6Im5hdnVuaXZlcnNlQGdtYWlsLmNvbSIsInJvbGVzIjpbInRlc3QiXSwidXNlcklkIjoiIn0.BdSEVljlcJWWTpe7Kq8gbN_vn5Ci2fp9HgQZo84nABriebFCQoVunSZgfsLK548gq7PxFlIjFonAK_li3GmcYA_FBhnwGIoommh7Zgw-8P9vQi4IYJCFfIHjeKf363uKyLxE4mjHXU23eJN_Vt9mBGeGiZEnr5C2WYi8yjbc8szuTZkTeE17_SDOP0X6OAb400HMG94udeWV0Ua8J-ED1B1ovMtYVHz1PcfX3TyKEKuh6CQ-GpIeNKQJuXGMcdzJj0gPmQ4Pva75a_t9NRjtKOrOAfZtfbEBMN8H5jiNr4pxPmUN8GnjPFUedOlS_MF5WrvJ2KAfRHQ6VMKoJP3Y5g";
			// Set the compact serialization on the JWS
			jws.setCompactSerialization(token);

			// Set the verification key
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			EncodedKeySpec publicKeySpec =
					new X509EncodedKeySpec(
							Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwIgQ3jNorcCahHarxnJRrYJM24LkXu+eqW0jopWuUzmJeRjFcjo1+QJfgKvZ4fH0sv/m9t+XP57G+5GI5JGekcgDCqVKWYoubvkuRtoRKvKfqorMfPVmgI9x92m7o8UCbxymFZo08+8wbsL07ZMutIdwsQNcOXdjD56IrgFGM99rEHPhhX6ILa3v5mn/kQEUF2yiApDtM4Htpw4639jQ708kyImpsSTnrNaioumm97ORaz2bVFxocF23xJ4dH2FCPEzGcnmau/q9VEvTh7AKTRs5dtamYw5ig3B+KQlMpza+ikYGjRurGoSj1bbXevOa1eFIklelUc+ByCcp5gKvFwIDAQAB"));
			PublicKey finalPublicKey = keyFactory.generatePublic(publicKeySpec);
			jws.setKey(finalPublicKey);

			// Check the signature
			boolean signatureVerified = jws.verifySignature();

			System.out.println("JWT Token Validation Status. Verified: " + signatureVerified);

			if (!signatureVerified) {
				System.out.println("invalid signature");
			} else {
				String string = jws.getPayload();
				System.out.println("payload: " + string);
			}
		} catch (Exception e) {
			System.out.println("Error decrypting JWS signed JWT token: " + e);
		}
	}

}