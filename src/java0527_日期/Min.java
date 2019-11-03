package java0527_����;

public class Min {
	//�ҳ�a��b��c��С����������Сֵ����d��������d�Ľ����ʹ���˹鲢�����������ٸ�ֵ
	
	public void merge(int[] arr,int p,int q,int r) {
		int n1 = q - p + 1;  //arr[] [p,q]
		int n2 = r - q;		 //arr[] [q+1,r]
		int[] L = null, R = null;
		L = new int[n1+1];
		R = new int[n2+1];
		//��arr[r+1]�����������µ�����L[p-q+1],R[r-q]
		//��arr��arr[p]��arr[q]��ֵ����������L[n1+1](L[0],L[1]...L[n1],���һλL[n1]δ��ֵ)
		for(int i=0;i<n1;i++) {
			L[i] = arr[p+i];
		}
		//��arr��arr[q+1]��arr[r]��ֵ����������R[n2+1](R[0],R[1]...R[n2],���һλR[n2]δ��ֵ)
		for(int j=0;j<n2;j++) {
			R[j] = arr[q+j+1];
		}
		//int�Ϳ��Ա�ʾ�����Χ��X11111111111111111111111111111(2\31,X��0��1����ʶ����)
		L[n1] = 2147483647;
		R[n2] = 2147483647;
		int i=0,j=0;
		//�������Ѿ��ź��������ϲ����õ��µ��ź��������
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
		int a=5,b=12,c=45,d=0;
		int[] arr = {a, b, c};
		Min m = new Min();
		m.merge_sort(arr, 0, arr.length-1);
		d = arr[0];
		System.out.println("d��ֵΪ��" + d);
	}
}
