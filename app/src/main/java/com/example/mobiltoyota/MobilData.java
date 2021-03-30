package com.example.mobiltoyota;

import java.util.ArrayList;

public class MobilData {
    private static String [] mobilName = {
        "Agya",
        "Alphard",
        "Avanza",
        "Calya",
        "Camry",
        "Corolla",
        "Fortuner",
        "Hiace",
        "Hilux",
        "Innova",
        "Ist",
        "Land Cruiser",
        "Raize",
        "Tundra",
        "Vellfire",
        "Vios",
        "Voxy",
        "Yaris"

    };

    private static String [] mobilDetail = {
        "Agya merupakan tipe low cost green car milik Toyota. Agya adalah mobil dengan ukuran kecil yang dapat menampung maksimal 5 orang",
        "Alphard merupakan tipe MPV mewah dari Toyota. Alphard sendiri menawarkan kemewahan dan kenyamanan berkendara yang tiada tara",
        "Avanza merupakan tipe MPV berukuran kecil milik Toyota. Avanza dapat menampung hingga maksimal 7 orang penumpang beserta keluasan bagasi",
        "Calya merupakan tipe low cost green car milik Toyota. Calya adalah mobil dengan ukuran sedang yang dapat menampung maksimal 7 orang",
        "Camry merupakan tipe sedan berukuran besar milik Toyota. Camry biasanya digunakan sebagai kendaraan pejabat publik di Indonesia",
        "Corolla merupakan tipe sedan berukuran medium milik Toyota. Saat ini Corolla memiliki 2 jenis yaitu biasa dan hybird",
        "Fortuner merupakan tipe SUV berukuran medium milik Toyota. Saat ini Fortuner memiliki 2 jenis yaitu penggerak 2 roda dan 4 roda",
        "Hiace merupakan tipe minibus milik Toyota. Hiace dapat menampung hingga 15 penumpang dengan kenyamanan berkendara yang sangat terjamin",
        "Hilux merupakan tipe double cabin milik Toyota. Hilux dapat mengangkut maksimal 5 penumpang dan barang yang bisa diletakkan pada bak",
        "Innova merupakan tipe MPV berukuran sedang milik Toyota. Innova dapat menampung hingga maksimal 7 orang penumpang beserta keluasan bagasi",
        "Ist merupakan tipe city car milik Toyota yang berukuran kecil. Mirip seperti Agya, Ist dapat menampung maksimal hingga 5 orang penumpang",
        "Land Cruiser merupakan tipe SUV berukuran besar milik Toyota. Lanc Cruiser sendiri merupakan tipe termewah dikelasnya yang menawarkan berbagai fasilitas",
        "Raize merupakan tipe compact SUV milik Toyota. Raize merupakan produk baru dari Toyota Indonesia yang diperkirakan akan masuk ke Indonesia tahun 2021",
        "Tundra merupakan tipe double cabin berukuran besar milik Toyota. Mirip seperti Hilux, Tundra juga dapat menampung hingga 5 orang penumpang",
        "Vellfire merupakan tipe MPV mewah dari Toyota. Vellfire merupakan saudara kembar dari Alphard dimana Vellfire lebih dihiasi dengan kesan sporty",
        "Vios merupakan tipe sedan berukuran kecil milik Toyota. Vios biasanya digunakan sebagai armada taksi oleh beberapa perusahaan",
        "Voxy merupakan tipe MPV berukuran medium milik TOyota. Voxy menawarkan kemewahan seperti Alphard dan Vellfire berupa sliding door pada pintu penumpang belakang",
        "Yaris merupakan tipe hatchback milik Toyota. Saat ini yaris sudah berkembang menjadi 3 generasi dan menjadi salah satu mobil terlaris pada Toyota"

    };

    private static int[] mobilImage = {
        R.drawable.agya,
        R.drawable.alphard,
        R.drawable.avanza,
        R.drawable.calya,
        R.drawable.camry,
        R.drawable.corolla,
        R.drawable.fortuner,
        R.drawable.hiace,
        R.drawable.hilux,
        R.drawable.innova,
        R.drawable.ist,
        R.drawable.landcruiser,
        R.drawable.raize,
        R.drawable.tundra,
        R.drawable.vellfire,
        R.drawable.vios,
        R.drawable.voxy,
        R.drawable.yaris

    };

    static ArrayList<Mobil> getListData(){
        ArrayList<Mobil> list = new ArrayList<>();
        for (int position = 0; position <mobilName.length; position++) {
            Mobil mobil = new Mobil();
            mobil.setName(mobilName[position]);
            mobil.setDetail(mobilDetail[position]);
            mobil.setPhoto(mobilImage[position]);
            list.add(mobil);
        }
        return list;
    }
}
