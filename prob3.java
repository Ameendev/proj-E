
/*The prime factors of:  13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

Generate computation that stores the prime factor of a number n
Sort the prime factors in ascending order
return the last element which is the largest prime factor of n.
*/

public class prob3{
//use a while loop for two scenarios odd and even
public static int maxPrimeFactor(int n){

	int myArray[] = new int [4];
	int index;
	int leftPtr;
	int rightPtr;
	int temp;
	int max;
	index = 0; 
	while( n % 2 == 0 || n % 3 == 0){
		n = n/2;
		myArray[index] = n;
		index++;
		
	
	//while( n % 3 == 0){
	//	n = n/3;
	//	myArray[index] = n;
	//	index++;
	System.out.println("index 1:" + index);
	
	
	System.out.println("index 1:" + index);
	for(int i = 0; i < myArray.length; i++){
		
		leftPtr = myArray[i];

			for(int j = i+1; j < myArray.length-1; j++){
				
				rightPtr = myArray[j];				
				
			
				if(leftPtr > rightPtr){
				
				temp = myArray[j];
				myArray[j] = myArray[i];
				myArray[i] = temp;	
						
				}
			}
	}
}
 	
	max = myArray[index];
	System.out.println("Index: " + index);
	return max;
}





	public static void main(String[] args){
		
		int n = maxPrimeFactor(13195);
		System.out.println(n);



	}





}





