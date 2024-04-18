import java.util.*;
public class ArrayQuestion {
    
    

    //calculate sum of all elements in the array 
    public void sumOfArrayElements(int num[]){
        int sum =0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        System.out.println("Sum of array elements are : "+sum);
    }

    //calculate the maximum value out of all the elements in the array 
    public void maximumValue(int num[]){
        int max=-1;
        for(int i=0;i<num.length;i++){
            if(max<num[i]){
                max=num[i];
            }
        }
        System.out.println("Maximum value of array are :"+max);
    }

    //Search the given element x in the array .if present then return the index else return -1;
    public void searchElement(int num[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element ,if you want to search :");
        int ele=sc.nextInt();
        int index=-1;
        for(int i=0;i<num.length;i++){
            if(ele==num[i]){
                index=i+1;
            }
        }
        System.out.println("element present at index :"+index);
    }

    //reverse the array elements
    public void reverseArray(int num[]){
        System.out.println("reverse array elements are :");
       for(int i=num.length-1;i>=0;i--){
        System.out.print(num[i]+" ");
       }
    }

    //count the number of occurences of a particular element x.
    public void numberOfOccurences(int num[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a element ,who's found the number of occurrences:");
        int ele=sc.nextInt();
        int count=0;
        for(int i=0;i<num.length;i++){
            if(ele==num[i]){
                count++;
            }
        }
        System.out.println("element "+ele+ " present "+count+" times ");
    }

    //Find the last occurrences of an element x in a given array 
    public void lastOccurrence(int num[]){
        int ele=num[num.length-1];
        int count=0;
        for (int i=0;i<num.length;i++){
            if(ele==num[i]){
                count++;
            }
        }
        System.out.println("Last occurrences present "+count+" times ");
    }

    //count the number of elements sticly greater than value x.
    public void numberOfGreaterEle(int num []){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements ,who's greater than :");
        int ele=sc.nextInt();
        int count=0;
        for(int i=0;i<num.length;i++){
            if(num[i]>ele){
                count++;
            }
        }
        System.out.println(count+" elements is greater than value "+ele);
    }

    //check if the given array is sorted or not 
    public void isSorted(int num[]){
        boolean check=true;
        for(int i=1;i<num.length;i++){
            if(num[i]<num[i-1]){
                check=false;
                break;
            }
        }
        System.out.println("is array sorted :"+check);
    }

    //find the smallest and largest element in the array 
    public void smallestLargestEle(int num[]){
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(small>num[i]){
                small=num[i];
            }
            if(large<num[i]){
                large=num[i];
            }
        }
        System.out.println("Smallest element in array are:"+small);


        System.out.println("Largest element in array are :"+large);
    }

    //find the 2nd smallest and 3rd smallest elements in array
    public void secondThirdSmallest(int num[] ){
        Arrays.sort(num);
        int ans[]={num[1],num[2]};
        System.out.println("2nd smallest element of array: "+ans[0]);
        System.out.println("3rd smallest element of array :"+ans[1]);

    }

    // find the second largest element in given array
    public void secondLargest(int num[]){
        Arrays.sort(num);
        System.out.println("second largest element of array :"+num[num.length-2]);
    }

    // find the total number of pairs in the Array whose sum is equal to the value x.
    public void sumOfPairs(int num[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ,who's find the sum of total pairs");
        int ele=sc.nextInt();
        int count=0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==ele){
                    count++;
                    System.out.println("Pairs :"+num[i]+","+num[j]);
                }
            }
        }
        System.out.println("Total pairs:"+count);
    }

    //Given an array consisting of integers. Return the first value that is repeating in the array.if no value is being repeated than return -1.
    public int firstReatingValue(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return num[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" array elements :");
        int num []=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        ArrayQuestion obj=new ArrayQuestion();
        // obj.sumOfArrayElements(num);
        // obj.maximumValue(num);
        //obj.searchElement(num);
        //obj.reverseArray(num);
        //obj.numberOfOccurences(num);
        //obj.lastOccurrence(num);
        // obj.numberOfGreaterEle(num);
        // obj.isSorted(num);
        // obj.smallestLargestEle(num);
        //obj.secondThirdSmallest(num);
        // obj.secondLargest(num);
        // obj.sumOfPairs(num);
        System.out.println("first repeating value "+obj.firstReatingValue(num));
    }


}
