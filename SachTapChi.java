public class SachTapChi extends Sach {
    private String ngayXuatBan;
    private String nhaXuatBan;

    public SachTapChi() {
        this.ngayXuatBan = null;
        this.nhaXuatBan = null;
    }

    public SachTapChi(int giaGoc, int coChu, int soTrang, String ngayXuatBan, String nhaXuatBan) {
        super(giaGoc, coChu, soTrang);
        this.ngayXuatBan = ngayXuatBan;
        this.nhaXuatBan = nhaXuatBan;
    }

    @Override
    protected double tinhGiaBan() {
        return giaGoc + giaGoc * 0.1 - this.giamGiaSach() + this.tinhPhuPhi();
    }

    @Override
    protected double giamGiaSach() {
        double x;
        if (soTrang > 200)
            x = 0;
        else {
            x = 0.05;
        }
        return x * giaGoc;
    }

    @Override
    protected double tinhPhuPhi() {
        double x = 0;
        if (giaGoc > 150000) {
            x = 0;
        } else {
            x = 20000;
        }
        return x;
    }
}
