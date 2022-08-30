public class SachVanHoc extends Sach {
    private String tacGia;
    private int namXuatBan;

    public SachVanHoc() {
        super();
        this.tacGia = "";
        this.namXuatBan = 0;
    }

    public SachVanHoc(int giaGoc, int phuPhi, int soTrang, String tacGia, int namXuatBan) {
        super(giaGoc, phuPhi, soTrang);
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
    }

    @Override
    protected double tinhGiaBan() {
        return giaGoc + giaGoc * 0.05 - this.giamGiaSach() + this.tinhPhuPhi();// 100 + 5000 - 5000 + 20000
    }

    @Override
    protected double giamGiaSach() {
        double x;
        if (soTrang > 150)
            x = 0;
        else {
            x = 0.05;
        }
        return x * giaGoc;
    }

    @Override
    protected double tinhPhuPhi() {
        double x = 0;
        if (giaGoc > 100000) {
            x = 0;
        } else {
            x = 20000;
        }
        return x;
    }
}
