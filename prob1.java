/* Problem 1:  if we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/
/*
This program is using one method to generate numbers
at a specified amount and get all the sum of multiples
3 or 5
so if the specified amount is 10, then its going to keep  numbers 1-9
in the array
*/
public class prob1{
//this method is going to return the sum of all the multiples of 3 0r 5
public static int multp(int num){
//local variable to store the value of the sum
int sum;
//the position of array element
int index;
//numbers to be stored
int numGen;
//create a new array and pass in the size num
int arr[] = new int[num];
	index =0;
	sum =0;
	numGen=1;
	while(index<num-1){
	arr[index] = numGen;
	if(arr[index] % 3 == 0 || arr[index] % 5 ==0 ){
sum += arr[index];
}
index++;
numGen++;
}

return sum;
}


	public static void main(String args[]){
		System.out.println("Problem 1 Euler");
		System.out.println("The following is a sum of all the multiples of 3 or 5 below 1000: "+ multp(1000));

}


}




