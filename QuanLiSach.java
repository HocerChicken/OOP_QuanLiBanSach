import java.util.ArrayList;

public class QuanLiSach<T> {
    private ArrayList<T> listSach = new ArrayList<T>();

    public void add(T obj) {
        listSach.add(obj);
    }

    public void tongGiaBanTapChi() {
        double sum = 0;
        for (int i = 0; i < listSach.size(); i++) {
            if (listSach.get(i) instanceof SachTapChi) {
                sum += ((SachTapChi) listSach.get(i)).tinhGiaBan();
            }
        }
        System.out.println("Tong gia ban tap chi la: " + sum);
    }
}
