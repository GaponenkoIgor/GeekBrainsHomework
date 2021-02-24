package ru.geekbrains.homework2;

public class Main {

//       Task 1
        int[] arr = {0, 1, 0, 0, 1};
           for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                   arr[i] = 0;
                } else {
                    arr[i] = 1;
                }
                System.out.println(arr[i]);
            }
    }
    }

//    Task 2
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
           arr[i]=i*3;
            System.out.print (arr[i]+ " " );
        }
    }
}
//   Task 3
       int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                System.out.print(w[i]*2 + " ");
            }else{
                System.out.print(w[i]*1 +" " );
            }
        }
    }
            }








