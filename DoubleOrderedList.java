public class DoubleOrderedList
{
  protected Node headAnimal; //protected instance variables are declared here
  protected Node headAmount;
  
  /* PRECONDITIONS: n/a
   * POSTCONDITIONS: the previously declared instance variables are initialized as null */
 
  public void DoubleOrderedList()
  {
    headAnimal = null;
    headAmount = null;
  }
  
  /* PRECONDITIONS: 2 parameters are brought in
   * POSTCONDITIONS: the two parameters are added to the lists and sorted alphabetically and numerically */
  
  public void add(String animal, int amount) //void method that brings in a string and integer
  {
    Node currentheadAnimal = headAnimal; //the current pointer is initialized as the headAnimal
    Node preheadAnimal = null; //the pointer to the previous headAnimal is initialized as null
    while ((currentheadAnimal != null) && (currentheadAnimal.animal.compareTo(animal) < 0)) //while loop that sets the 
    {
      preheadAnimal = currentheadAnimal;   //previous node as the current node
      currentheadAnimal = currentheadAnimal.nextAnimal; //and the current node as the next node
    }
    Node currentheadAmount = headAmount; //same as above except for amount
    Node preheadAmount = null;
    while((currentheadAmount != null) && (currentheadAmount.amount < amount)) 
    {
      preheadAmount = currentheadAmount; //same as above except for amount
      currentheadAmount = currentheadAmount.nextAmount;
    }
    Node Node1 = new Node(animal, amount, currentheadAnimal, currentheadAmount); //Node constructor is called
    if(preheadAnimal != null) //if the previous pointer is not null, set the previous headAnimal to the next node's animal
    {
      preheadAnimal.nextAnimal = Node1;
    }
    else //else already the head node
    {
      headAnimal = Node1;
    }
    if(preheadAmount != null) //same as above except with amount
    {
      preheadAmount.nextAmount = Node1;
    }
    else
    {
      headAmount = Node1;
    }
  }
  
  /* PRECONDITIONS: string is called in
   * POSTCONDITIONS: the animal (string) is removed from the list */
  
  public void delete(String animal) //void method that calls in a string
  {
    Node currentheadAnimal = headAnimal; //initialization of pointers
    Node preheadAnimal = null; 
    while((currentheadAnimal != null) && (currentheadAnimal.animal.equals(animal) == false)) //if the current pointer
    {
      preheadAnimal = currentheadAnimal; //is not null and the animal is not in the current node, move on and keep checking
      currentheadAnimal = currentheadAnimal.nextAnimal;
    }
    Node currentheadAmount = headAmount; //same as above except for amount
    Node preheadAmount = null;
    if(currentheadAnimal == null) //if the current pointer is null, end of checking and the animal cannot be found
    {
       System.out.println("Sorry, the animal you are trying to delete cannot be found."); //prints this message
    }
    else
    {
       preheadAnimal.nextAnimal = currentheadAnimal.nextAnimal; //otherwise, set the previous pointer to the next
      while(currentheadAmount.amount != currentheadAnimal.amount) 
      {
        preheadAmount = currentheadAmount; 
        currentheadAmount = currentheadAmount.nextAmount;
      }
      preheadAmount.nextAmount = currentheadAmount.nextAmount;
    }
  }
    
  /* PRECONDITIONS: n/a
   * POSTCONDITIONS: overrides the default toString method */
  
  public String toString()
  {
    Node currentheadAnimal = headAnimal; //initializes currentheadanimal and output
    String output = "";
    while(currentheadAnimal != null) //if the current pointer is not null
    {
      output += currentheadAnimal.animal + " " + currentheadAnimal.amount + "-->"; //add to the string the animal and amount
      currentheadAnimal = currentheadAnimal.nextAnimal; //move the pointer to the next node
    }
    return output += "null"; 
  }
  
  /* PRECONDITIONS: n/a
   * POSTCONDITIONS: when called, prints the following */
  
  public String printAmount()
  {
    Node currentheadAmount = headAmount; //initialization of currentheadamount and output
    String output = "";
    while(currentheadAmount != null) //if the current pointer is not null
    {
      output += currentheadAmount.amount + " " + currentheadAmount.animal + "-->"; //add to the string the amount and animal
      currentheadAmount = currentheadAmount.nextAmount; //move the pointer to the next node
    }
    return output += "null";
  }
} //end
