package com.qifuataufiqs.myrecyclerview;

import java.util.ArrayList;

public class CoreHaq {
    public static String[][] data = new String[][] {
            {"Sukmo Afri Ardi Saputro","CEO .haq","https://pbs.twimg.com/profile_images/1070486744187863040/ggupvk5d_400x400.jpg"},
            {"Sukmo Afri Ardi Saputro","CEO .haq","https://pbs.twimg.com/profile_images/1070486744187863040/ggupvk5d_400x400.jpg"},
            {"Sukmo Afri Ardi Saputro","CEO .haq","https://pbs.twimg.com/profile_images/1070486744187863040/ggupvk5d_400x400.jpg"},
            {"Sukmo Afri Ardi Saputro","CEO .haq","https://pbs.twimg.com/profile_images/1070486744187863040/ggupvk5d_400x400.jpg"},
            {"Sukmo Afri Ardi Saputro","CEO .haq","https://pbs.twimg.com/profile_images/1070486744187863040/ggupvk5d_400x400.jpg"},
    };

    public static ArrayList<CoreVisual> getListData() {
        CoreVisual corelvisual = null;
        ArrayList<CoreVisual> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            corelvisual = new CoreVisual();
            corelvisual.setNama(data[i][0]);
            corelvisual.setPosisi(data[i][1]);
            corelvisual.setFoto(data[i][2]);

            list.add(corelvisual);
        }
        return list;
    }
}
