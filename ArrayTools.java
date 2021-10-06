/*-------Name: Poonam mahi
 * Student Id: A00218307
 * Mobile application development(MAPD)
 */

import java.util.Scanner;

public class ArrayTools{
	public static void main(String[] args) {
		 userFirstInput();			 
		  
	}
	
	/* -----Taking all operation input---- */
	public static void userFirstInput() {
		Scanner inputObj = new Scanner(System.in); // Create a Scanner object                 
		System.out.println("1.Caesar Cipher to encrypt \n"
				  			+"2. Average of array \n"
				  			+ "3.Find element in the array \n"
				  			+ "4.Reverse the array \n"
				  			+ "5.Linear-search function to find the index of an element \n" 
				  			+ "Select one of the following operation:\n");		  
		  
	  int operationInput = inputObj.nextInt(); // Read user operation input
	 
	  switch(operationInput) {
	  case 1: 
		  cypherText();
		  break;
	  case 2:
		  arrayAvg();
		  break;
	  case 3:
		  arrayContains();
		  break;
	  case 4:
		  reverseArray();
		  break;
	  case 5:
		 findIndex();
		  break;
	  default:
		  System.out.println("Please re-run program and enter an integer number between 1 and 5 to select an operation. \n");
		  System.exit(0);
		  break;
	  }
	inputObj.close();	
	}
	
	/* -----Asking whether user wants to perform further operation or not---- */
	public static void askPermission() {
		System.out.println("Would you like to do furthur operations?(y/n): \n");
		Scanner s=new Scanner(System.in);
		char yesNo = s.next().charAt(0);
		
		if(yesNo == 'y') 
		{
			userFirstInput();
		}
		else
		{
			System.exit(0);
			s.close();
		}
	}
	
	/* -----calculate average of array---- */
	public static void arrayAvg(){
        // reading the array size.
        Scanner s = new Scanner(System.in);
 
        System.out.println("Enter array size: \n");
        int size = s.nextInt();
        // create an array
        int[] array = new int[size];
 
        // reading values from user keyboard
        System.out.println("Enter array values :  \n");
        for (int i = 0; i < size; i++) {
            int value = s.nextInt();
            array[i] = value;
 
        } 
        // getting array length
        int length = array.length;
 
        // default sum value.
        float sum = 0;
 
        // sum of all values in array using for loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        } 
       float average = sum / length;
 
       // Print the result
        System.out.println("Average number of arrays value is: \n" + average);
        askPermission();
        s.close();
}


/* -----Checks whether array contains element or not---- */
	
// Function return true if given element
    // found in array
    public static void arrayContains()
    {
	// reading the array size.
        Scanner s = new Scanner(System.in);
 
        System.out.println("Enter array size: \n");
        int size = s.nextInt();
        // create an array
        int[] arr = new int[size];
 
        // reading values from user keyboard
        System.out.println("Enter integer values in array: \n");
        for (int i = 0; i < size; i++) {
            int value = s.nextInt();
            arr[i] = value;
         }

	//reading checkToValue
	System.out.println("Enter the Integer value you want to check is present or not :  \n");
	 int toCheckValue = s.nextInt();

        // check if the specified element
        // is present in the array or not
        // using Linear Search method
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }
 
        // Print the result
        System.out.println("Is " + toCheckValue + " present in the array: " + test);
       
        askPermission();
        s.close();
    }


/* -----function that reverses array and stores it in another array---- */

   public static void reverseArray()
    {
	// reading the array size.
        Scanner s = new Scanner(System.in);
 
        System.out.println("Enter array size: \n");
        int size = s.nextInt();
        // create an array
        int[] a = new int[size];
 
        // reading values from user keyboard
        System.out.println("Enter integer values in array:  \n");
        for (int i = 0; i < size; i++) {
            int value = s.nextInt();
            a[i] = value;
         }

        int[] b = new int[size];
        int j = size;
        for (int i = 0; i < size; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
 
        /*printing the reversed array*/
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < size; k++) {
            System.out.println(b[k]);
        }
       
        askPermission();
        s.close();
    }



/*------- Linear-search function to find the index of an element------------*/
    public static void findIndex()
    {
 
	// reading the array size.
        Scanner s = new Scanner(System.in);
 
        System.out.println("Enter array size: \n");
        int size = s.nextInt();
        // create an array
        int[] arr = new int[size];
 
        // reading values from user keyboard
        System.out.println("Enter integer values in array:  \n");
        for (int i = 0; i < size; i++) {
            int value = s.nextInt();
            arr[i] = value;
         }

	//reading searchValue
	System.out.println("Enter the Integer value you want to check is present or not :  \n");
	 int t = s.nextInt();
	 s.close();

        // if array is Null
        if (arr == null) {
           System.out.println("Array is empty"); //empty array
        }
 
        // find length of array
        int i = 0;
 
        // traverse in the array
        while (i < size) {
 
            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                System.out.println("Index position of " + t + " is: "+ i);
                askPermission();
            }
            else {
                i = i + 1;
            }
        }
        System.out.println("The value you entered is not there in array"); // value is not there in array
        askPermission();
    }


/*-----Caesar cypher--------------*/
public static void cypherText(){

	Scanner sc = new Scanner(System.in);
        System.out.println(" Input the plaintext message : \n");
	//reading plain text
        String plaintext = sc.nextLine();
        System.out.println(" Enter the value by which each character in the plaintext message gets shifted : \n");
        int shift = sc.nextInt();
        String ciphertext = "";
        char alphabet;
        for(int i=0; i < plaintext.length();i++) 
        {
             //Shift one character at a time
            alphabet = plaintext.charAt(i);
            
            //if alphabet lies between a and z 
            if(alphabet >= 'a' && alphabet <= 'z') 
            {
             //shift alphabet
             alphabet = (char) (alphabet + shift);
             //if shift alphabet greater than 'z'
             if(alphabet > 'z') {
                //re shift to starting position 
                alphabet = (char) (alphabet+'a'-'z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            
            //if alphabet lies between 'A'and 'Z'
            else if(alphabet >= 'A' && alphabet <= 'Z') {
             //shift alphabet
             alphabet = (char) (alphabet + shift);    
                
             //if shift alphabet greater than 'Z'
             if(alphabet > 'Z') {
                 //re shift to starting position 
                 alphabet = (char) (alphabet+'A'-'Z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            else {
             ciphertext = ciphertext + alphabet;   
            }
        
    }
    System.out.println(" ciphertext of : " + plaintext+ " is: "  + ciphertext);
   
    askPermission();
    sc.close();
  }

}

