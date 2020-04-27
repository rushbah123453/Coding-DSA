package dsa.queue.ImplementationOfQueue;

import java.util.Scanner;

public class Petrol
{ 
    // A petrol pump has petrol and distance to next petrol pump 
    static class petrolPump 
    { 
        int petrol; 
        int distance; 
          
        // constructor 
        public petrolPump(int petrol, int distance)  
        { 
            this.petrol = petrol; 
            this.distance = distance; 
        } 
    } 
      

    static int printTour(petrolPump arr[], int n) 
    {   
        int start = 0; 
        int end = 1; 
        int curr_petrol = arr[start].petrol - arr[start].distance; 
          

        while(end != start || curr_petrol < 0) 
        { 
              

            while(curr_petrol < 0 && start != end) 
            { 

                curr_petrol -= arr[start].petrol - arr[start].distance; 
                start = (start + 1) % n; 
                  

                if(start == 0) 
                    return -1; 
            } 
            // Add a petrol pump to current tour 
            curr_petrol += arr[end].petrol - arr[end].distance; 
              
            end = (end + 1)%n; 
        } 
          
        // Return starting point 
        return start; 
    } 
      
    // Driver program to test above functions 
    public static void main(String[] args)  
    { 

        calculateStartPoint();
  
    }

    private static void calculateStartPoint() {
        Scanner scanner=new Scanner(System.in);
        int numberOfPetrolpumps=scanner.nextInt();
        int amountOfGas[]=new int[numberOfPetrolpumps];
        int costOfGas[]=new int[numberOfPetrolpumps];
        petrolPump arr[]=new petrolPump[numberOfPetrolpumps];

        for (int i=0;i<numberOfPetrolpumps;i++){
            amountOfGas[i]=scanner.nextInt();
        }

        for (int i=0;i<numberOfPetrolpumps;i++){
            costOfGas[i]=scanner.nextInt();
        }

        for (int i=0;i<numberOfPetrolpumps;i++){
           arr[i]= new petrolPump(amountOfGas[i],costOfGas[i]);
        }


        int start = printTour(arr, arr.length);

        System.out.println(start == -1 ? "No Solution" : "Start = " + start);

    }

} 