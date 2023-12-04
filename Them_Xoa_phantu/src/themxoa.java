import java.util.Scanner;

public class themxoa {
	public static void main(String[] args) {
		int n;
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhap vao so phan tu: ");
		n = nhap.nextInt();
		int dayso[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu "+(i+1)+":");
			dayso[i] = nhap.nextInt();
		}
		System.out.println("day so vua nhap vao la: ");
		for(int i =0; i < n; i++) System.out.print(dayso[i]+" ");
		
//Xoa phan tu:
		System.out.println("Nhap gia tri can xoa: ");
		int gt = nhap.nextInt();
		for (int i=0;i<n;i++) 
			if (dayso[i] == gt) {
					for (int j=i;j<n-1;j++) dayso[j]=dayso[j+1];
							i=n;
							n--;
							}
				
		System.out.println("day so sau khi xoa:");
		for(int i=0;i<n;i++) {
			System.out.print(dayso[i]+" ");
		}
		
//Them phan tu
		System.out.println("nhap gia tri phan tu can them: ");
		int gtri = nhap.nextInt();
		for ( int i = 0; i < n; i++) if (dayso[i] >= gtri) {
			for(int j = n; j > i; j--) {
				dayso[j]= dayso[j-1];
				dayso[i]= gt; 
				i = n;
			}
		}else dayso[n] = gt;
		System.out.println("Day so sau khi them la: ");
		for ( int i = 0; i < n; i++) {
			System.out.print(dayso[i]+" ");
		}
			
		
	}
}
