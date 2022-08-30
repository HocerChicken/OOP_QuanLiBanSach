<pre>
# OOP_QuanLiBanSach
Thiết kế có 3 lớp:

Lớp Sach( lớp trừu tượng):
  -	Thuộc tính:
      	    int giaGoc: giá gốc của sách.
	    int coChu: cỡ chữ của sách.
	    int soTrang: số trang của sách.
  -	Phương thức:
	      Phương thức khởi tạo:
	          public Sach(): phương thức khởi tạo không có tham số.
	          public Sach(int giaGoc, int coChu, int soTrang): phương thức khởi tạo có tham số.
	      Phương thức xử lý:
	          protected abstract double tinhGiaBan(): phương thức trừu tượng dùng để tính giá bán.
            protected abstract double giamGiaSach(): phương thức trừu tượng dùng để tính số tiền giảm giá.
            protected abstract double tinhPhuPhi(): phương thức trừu tượng tính phụ phí.

Lớp SachVanHoc kế thừa từ lớp Sach:
  -	Thuộc tính:
      	    String tacGia: tác giả của sách văn học.
	    String namXuatBan: nhà xuất bản của sách văn học.
  -	Phương thức:
      Phương thức khởi tạo:
          public Sachvanhoc(): phương thức khởi tạo của sách văn học không có tham số.
	        public SachVanHoc(int giaGoc, int phuPhi, int soTrang, String tacGia, int namXuatBan): phương thức khởi tạo của sách văn học có tham số.(Overloading).
    	Phương thức xử lí:
          @Override protected double tinhGiaBan(): phương thức này ghi đè phương thức trừu tượng của Sach( được tính dựa trên giá gốc + thuế(5%) + giamGiaSach + tinhPhuPhi).
          @Override protected double giamGiaSach(): phương thức này ghi đè phương thức trừu tượng của Sach (được tính dựa trên số trang sách nếu lớn hơn 150 thì sẽ không giảm ngược lại giảm 5%).
          @Overide protected double tinhPhuPhi(): phương thức này ghi đè phương thức trừu tượng của Sach (được tính dựa trên giá gốc của sách nếu lớn hơn 100000 thì sẽ được freeship ngượi lại tính phí 20000).

Lớp SachTapChi kế thừa từ lớp Sach:
  -	Thuộc tính:
      String ngayXuatBan: ngày xuất bản của tạp chí.
	    String nhaXuatBan: nhà xuất bản của tạp chí.
-	Phương thức:
o	Phương thức khởi tạo:
      public sachTapChi(): phương thức khởi tạo không có tham số.
	    public sachTapChi(int giaGoc, int coChu, int soTrang, String ngayXuatBan, String nhaXuatBan): phương thức khởi tạo có tham số.	
o	Phương thức xử lí:
	    @Override protected double tinhGiaBan(): phương thức này ghi đề phương thức trừu tượng của Sach( được tính bằng giá gốc + giamGiaSach + thuế(10%) + tinhPhuPhi).
	    @Override protected double giamGiaSach(): phương thức này ghi đề phương thức trừu tượng của lớp Sach (được tính dựa trên số trang sách nếu lớn hơn 200 thì miễn phí ngược lại giảm 5%).
	    @Override protected double tinhPhuPhi: phụ phí ở đây có thể là phí đóng gói hay vận chuyển, phương thức này ghi đè phương thứ trừu tượng của lớp Sach (được tính dựa trên giá gốc của sách nếu lớn hơn 150000 thì được freeship ngược lại tính phí là 20000).
</pre>
