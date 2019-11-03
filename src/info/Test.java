package info;

import java.util.Arrays;

public class Test {
	
	public void merge(int[] arr,int p,int q,int r) {
		int n1 = q - p + 1;  //arr[] [p,q]
		int n2 = r - q;		 //arr[] [q+1,r]
		int[] L = null, R = null;
		L = new int[n1+1];
		R = new int[n2+1];
		//将arr[5]数组变成两个新的数组L[p-q+1],R[r-q]
		//将arr[6]从arr[p]到arr[q]的值赋给新数组L[n1+1](L[0],L[1]...L[n1],最后一位L[n1]未赋值)
		for(int i=0;i<n1;i++) {
			L[i] = arr[p+i];
		}
		//将arr[6]从arr[q+1]到arr[r]的值赋给新数组R[n2+1](R[0],R[1]...R[n2],最后一位R[n2]未赋值)
		for(int j=0;j<n2;j++) {
			R[j] = arr[q+j+1];
		}
		//int型可以表示的最大范围是X11111111111111111111111111111(2\31,X用0或1来标识正负)
		L[n1] = 2147483647;
		R[n2] = 2147483647;
		int i=0,j=0;
		//将两个已经排好序的数组合并，得到新的排好序的数组
		for(int k=p;k<=r;k++) {
			if(L[i]<=R[j]) {
				arr[k] = L[i];
				i = i + 1;
			} else {
				arr[k] = R[j];
				j = j + 1;
			}
		}
	}
	
	public void merge_sort(int[] arr,int p,int r) {
		if(p<r) {
			int q = (p+r)/2;
			merge_sort(arr,p,q);
			merge_sort(arr,q+1,r);
			merge(arr,p,q,r);
		}
	}
	public static void main(String[] args) {
		int[] A = {9, 12, 6, 3, 2,  17};
		//		   0   1  2  3   4  5
		int p=0,r=5;
		Test t = new Test();
		t.merge_sort(A, p, r);
		System.out.println(Arrays.toString(A));
	}

}
