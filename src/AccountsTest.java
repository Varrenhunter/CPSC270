import static org.junit.Assert.*;

import org.junit.Test;

public class AccountsTest {
/**
* Checks the Add method to see if Accounts contains the added account
*/
@Test
public void doesAccountsContainAddedAccount() {
Accounts accts = new Accounts();
accts.add("Ethan");
boolean expected = true;
assertEquals(expected, accts.find("Ethan"));
}
/**
 * 
 */
@Test
public void DoesFindDiscoverAddedName() {
Accounts accts = new Accounts();
accts.add("Ethan");
accts.add("Talia");
accts.add("Bob");
boolean expected = true;
assertEquals(expected, accts.find("Talia"));
}
/**
 * 
 */
@Test
public void DoesFindDiscoverNonExistentName() {
Accounts accts = new Accounts();
accts.add("Ethan");
accts.add("Talia");
accts.add("Bob");
boolean expected = false;
assertEquals(expected, accts.find("Peter"));
}
/**
 * 
 */
@Test
public void isTheNumberOfNamesCorrect() {
Accounts accts = new Accounts();
accts.add("Ethan");
accts.add("Talia");
accts.add("Bob");
int expected = 3;
assertEquals(expected, accts.numOfNames());
}
/**
 * 
 */
@Test
public void isNewAcountsCollectionEmpty() {
Accounts accts = new Accounts();
int expected = 0;
assertEquals(expected, accts.numOfNames());
}
/**
 * 
 */
@Test
public void DoesPrintPrintNames() {

}
/**
 * 
 */
@Test
public void DoesRemoveRemoveAddedName() {
    Accounts accts = new Accounts();
    accts.add("Ethan");
    accts.add("Talia");
    accts.remove("Ethan");

    assertFalse(accts.find("Ethan"));
}
@Test
public void Input2WillFitTest() {
    Accounts accts = new Accounts();
    accts.add("Ethan");
    accts.add("Talia");
    accts.add("Bob");
    boolean expected = true;
    assertTrue(accts.willFit(2));
    assertTrue(accts.willFit(3));
    assertTrue(accts.willFit(4));
}
}