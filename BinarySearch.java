package 二分查找;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
     public static int binarySearchBasic(int[] a,int target) {
    	 int i=0,j=a.length; //设置指针初值
    	 int candidate=-1;
    	 while(i<j) { //范围有内容
    		 int m=(i+j)>>>2;
    		 if(target<a[m]) {
    			 j=m;
    		 }else if(target>a[m]) {
    			 i=m+1;
    		 }else {
    			candidate=m;
    			j=m-1;     //找最左的元素
    		 }
    	 }
    	 return candidate;
	}

}
