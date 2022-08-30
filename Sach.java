public abstract class Sach {
    protected int giaGoc;
    protected int coChu;
    protected int soTrang;

    protected Sach() {
        this.giaGoc = 0;
        this.coChu = 0;
        this.soTrang = 0;
    }

    protected Sach(int giaGoc, int coChu, int soTrang) {
        this.giaGoc = giaGoc;
        this.coChu = coChu;
        this.soTrang = soTrang;
    }

    protected abstract double tinhGiaBan();

    protected abstract double giamGiaSach();

    protected abstract double tinhPhuPhi();
}
