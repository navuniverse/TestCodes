/*
 * 3CLogic Inc. CONFIDENTIAL
 * Unpublished Copyright (c) 2007-2014 3CLogic Inc., All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains the property of COMPANY. The intellectual and technical concepts contained
 * herein are proprietary to COMPANY and may be covered by U.S. and Foreign Patents, patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained
 * from COMPANY.  Access to the source code contained herein is hereby forbidden to anyone except current COMPANY employees, managers or contractors who have executed 
 * Confidentiality and Non-disclosure agreements explicitly covering such access.
 *
 * The copyright notice above does not evidence any actual or intended publication or disclosure  of  this source code, which includes  
 * information that is confidential and/or proprietary, and is a trade secret, of  COMPANY.   ANY REPRODUCTION, MODIFICATION, DISTRIBUTION, PUBLIC  PERFORMANCE, 
 * OR PUBLIC DISPLAY OF OR THROUGH USE  OF THIS  SOURCE CODE  WITHOUT  THE EXPRESS WRITTEN CONSENT OF COMPANY IS STRICTLY PROHIBITED, AND IN VIOLATION OF APPLICABLE 
 * LAWS AND INTERNATIONAL TREATIES.  THE RECEIPT OR POSSESSION OF  THIS SOURCE CODE AND/OR RELATED INFORMATION DOES NOT CONVEY OR IMPLY ANY RIGHTS  
 * TO REPRODUCE, DISCLOSE OR DISTRIBUTE ITS CONTENTS, OR TO MANUFACTURE, USE, OR SELL ANYTHING THAT IT  MAY DESCRIBE, IN WHOLE OR IN PART.                
 */
package multithreading;

/**
 * @author Naveen
 * 
 * @Date 08-Aug-2016
 */
public class EvenOdd {

	static Object lock = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {

				for (int itr = 1; itr < 51; itr = itr + 2) {
					synchronized (lock) {
						System.out.println(itr);
						try {
							lock.notify();
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {

				for (int itr = 2; itr < 51; itr = itr + 2) {
					synchronized (lock) {
						System.out.println(itr);
						try {
							lock.notify();
							if (itr == 50) {
								break;
							}
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});
		try {
			t1.start();
			t2.start();
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
