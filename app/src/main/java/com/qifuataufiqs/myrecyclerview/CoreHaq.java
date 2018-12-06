package com.qifuataufiqs.myrecyclerview;

import java.util.ArrayList;

public class CoreHaq {
    public static String[][] data = new String[][] {
            {"Sukmo Afri Ardi Saputro","CEO .haq","qifuataufqis.jpg"},
            {"Sukmo Afri Ardi Saputro","CEO .haq","qifuataufqis.jpg"},
            {"Sukmo Afri Ardi Saputro","CEO .haq","qifuataufqis.jpg"},
            {"Sukmo Afri Ardi Saputro","CEO .haq","qifuataufqis.jpg"},
            {"Sukmo Afri Ardi Saputro","CEO .haq","qifuataufqis.jpg"},
    };

    public static ArrayList<CoreVisual> getListData() {
        CoreVisual corehaq = null;
        ArrayList<CoreVisual> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            corehaq = new CoreVisual();
            corehaq.setNama(data[i][0]);
            corehaq.setPosisi(data[i][1]);
            corehaq.setFoto(data[i][2]);

            list.add(corehaq);
        }
        return list;
    }
}
