public class Node
{
  protected String animal; //protected instance variables are declared here
  protected int amount;
  protected Node nextAnimal;
  protected Node nextAmount;
  
  /* PRECONDITION: 4 parameters are brought in
   * POSTCONDITION: the previously declared instance variables are initialized and assigned values */
  public Node(String tempanimal, int tempamount, Node tempnextAnimal, Node tempnextAmount) //4 arg constructor
  {
    animal = tempanimal;
    amount = tempamount;
    nextAnimal = tempnextAnimal;
    nextAmount = tempnextAmount;
  }
  
  /* PRECONDITION: n/a
   * POSTCONDITIONS: the following is printed when the toString method is called */
  public String toString()
  {
    return "Animal: " +animal+ "Amount: " +amount;     
  }
}
