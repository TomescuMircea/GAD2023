public class GenericBinarySearch<T> {
    public int binarySearch(T[] arr,T elem)
    {
        int i=0;
        while(i< arr.length-1)
        {
            if(arr[i]<=arr[i+1])
                i++;
            else break;
        }
        if(i==arr.length)
        {
            int st=0;
            int dr=arr.length-1;
            int m;
            while(st<dr)
            {
                m=(st+dr)/2;
                if(elem==arr[m])
                    return m;
                else if(elem>arr[m])
                {
                    st=m+1;
                }
                else dr=m-1;
            }
            if(arr[st]==arr[m])
                return m;
            else return -1;
        }
        else if(i!=0)
            return -1;
        else {
            i=arr.length-1;
            while(i>0)
            {
                if(arr[i]>=arr[i+1])
                    i--;
                else break;
            }
            if(i!=0)
                return -1;
            int st=0;
            int dr=arr.length-1;
            int m;
            while(st<dr)
            {
                m=(st+dr)/2;
                if(elem==arr[m])
                    return m;
                else if(elem<arr[m])
                {
                    st=m+1;
                }
                else dr=m-1;
            }
            if(arr[st]==arr[m])
                return m;
            else return -1;
        }
    }
}
