public class Test {
public static void main(String[] args) {
	Ngay ngay1 = new Ngay(15, 5, 2021);
	Ngay ngay2 = new Ngay(15, 9, 2030);
	Ngay ngay3 = new Ngay(15, 9, 2025);
	
	TacGia tacGia1 = new TacGia("Giang", ngay1);
	TacGia tacGia2 = new TacGia("Duy", ngay2);
	TacGia tacGia3 = new TacGia("Cua", ngay3);
	
	Sach sach1 = new Sach("Lap trinh C", 5000, 2023, tacGia1);
	Sach sach2 = new Sach("Lap trinh Java", 10000, 2021, tacGia2);
	Sach sach3 = new Sach("Lap trinh Mang", 15000, 2029, tacGia3);
	
	sach1.inTenSach();
	sach2.inTenSach();
	sach3.inTenSach();
	
	System.out.println("So sanh NXB sach 1 va 3 : "+sach1.kiemTraCungNamXuatBan(sach3));
	
	System.out.println("Sach 1 giam 10%: " +sach1.giaSauKhiGiam(10));
}
}
