import java.util.Scanner;

class EvenNumber{
    public static void findRange(int[] arr,int q,int query[][]) {
        int psum[] = new int[arr.length];

        psum[0] = arr[0] % 2 == 0 ? 1 : 0;
        for (int i = 1; i < arr.length; i++) {
            psum[i] = psum[i - 1] + (arr[i] % 2 == 0 ? 1 : 0);
             //System.out.print(psum[i]+" ");
        }



        int res[]=new int[q];
        int it=0;
        while (q > 0) {
            int l=query[it][0];
            int r=query[it][1];
            if (l == 0) {
                res[it]= psum[r];
            } else {
                res[it]= psum[r] - psum[l-1];
            }
            System.out.println(res[it]);
            it++;
            q--;

        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter size of array:");
        int sze=scanner.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[sze];
        for (int i=0;i<sze;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter number of queries");
        int q= scanner.nextInt();
        int query[][]=new int[q][2];
            System.out.println("Enter  value");
        for(int i=0; i< q;i++)
        {
            for(int j=0;j<2;j++)
            {
                query[i][j]=scanner.nextInt();
            }
        }

        findRange(arr,q,query);

    }
}
