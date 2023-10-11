class V
{
    int [] array;int [] a;int [] al;int [] ar;
    void init(int [] p)
    {
        array=p;
    }
    void binarysearch(int key)
    { a=array;
        for (int i=0;i<a.length-1;i++)

    for (int j=1;j<a.length-i-1;j++)
    {
        if(a[j]>a[j+1])
        {
            a[j]=a[j]^a[j+1];
            a[j+1]=a[j]^a[j+1];
            a[j]=a[j]^a[j+1];
           
           
        }
    }
    int mid, low = 0, high = a.length - 1, r = 0;
      while (low <= high) {
    mid = (low + high) / 2;
    if (a[mid] == key) {
        System.out.printf("BS - The value is present at %d\n", mid);
        r = -1;
        break;
    } else if (key < a[mid]) {
        high = mid - 1;
    } else {
        low = mid + 1;
    }
   }
   if (r == 0) {
    System.out.println("The element does not exist");
   }
    }


    void linearsearch(int key)
    { int f=0;
        for(int i=0;i<array.length;i++)
        {
             
            if(array[i]==key)
            {
                System.out.println("LS- The element is found at index " + i);
                f=-1;
                break;
            }
        }
        if (f==0)
        {
            System.out.println("The element does not exist");
        }
    }
    void bubblesort()
    { al=array;
        for (int i=0;i<al.length-1;i++)
        {
            for (int j=i;j<al.length-i-1;j++)
            {
                if(al[j]>al[j+1])
                {
                    al[j]=al[j]^al[j+1];
                    al[j+1]=al[j]^al[j+1];
                    al[j]=al[j]^al[j+1];
                   
                   
                }
            }
        }
        System.out.printf("Bubble sort - ");
        for(int k=0;k<array.length;k++)
        {
            System.out.printf("%d ",al[k]);
        }
    }
    void show(int []a)
    { 
        System.out.println("");
        System.out.printf("Array - ");
        for(int i=0;i<a.length;i++)
            System.out.printf("%d ",a[i]);
    }
    }    
    
class Voperations
{
    public static void main(String [] args)
    {
        V vop=new V();
        int [] arr={11,6,77,8,5,44,6,9,442,86,73,49,68,82};
        int [] a={11,6,77,8,5,44,6,9,442,86,73,49,68,82};
        vop.init(arr);
        vop.linearsearch(442);
        vop.binarysearch(442);
        vop.bubblesort();
        vop.show(a);
        
        
    }
}