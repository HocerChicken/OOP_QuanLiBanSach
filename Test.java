import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        System.out.println("=====sach van 1=====");
        SachVanHoc sachVan0 = new SachVanHoc(100000, 16, 96, "Nguyen van A", 2021);
        System.out.println("Gia ban: " + sachVan0.tinhGiaBan());
        System.out.println("Giam gia: " + sachVan0.giamGiaSach());
        System.out.println("phu phi: " + sachVan0.tinhPhuPhi());
        System.out.println("=====sach tap chi 1=====");
        SachTapChi sachTapChi0 = new SachTapChi(100000, 16, 100, "24/07/2021", "Nha Xuat Ban A");
        System.out.println("Gia ban: " + sachTapChi0.tinhGiaBan());
        System.out.println("Giam gia: " + sachTapChi0.giamGiaSach());
        System.out.println("phu phi: " + sachTapChi0.tinhPhuPhi());

        SachVanHoc sachVan1 = new SachVanHoc(100000, 16, 200, "Nguyen Van B", 2021);
        SachVanHoc sachVan2 = new SachVanHoc(120000, 16, 96, "Nguyen Van C", 2021);
        SachVanHoc sachVan3 = new SachVanHoc(130000, 16, 200, "Nguyen Van D", 2021);
        SachTapChi sachTapChi1 = new SachTapChi(140000, 16, 100, "24/07/2021", "Nha Xuat Ban A");
        SachTapChi sachTapChi2 = new SachTapChi(150000, 16, 100, "24/07/2021", "Nha Xuat Ban B");
        SachTapChi sachTapChi3 = new SachTapChi(160000, 16, 100, "24/07/2021", "Nha Xuat Ban C");

        QuanLiSach quanLiSach = new QuanLiSach();
        quanLiSach.add(sachVan1);
        quanLiSach.add(sachVan2);
        quanLiSach.add(sachVan3);
        quanLiSach.add(sachTapChi1);
        quanLiSach.add(sachTapChi2);
        quanLiSach.add(sachTapChi3);
        quanLiSach.tongGiaBanTapChi();
    }
}
