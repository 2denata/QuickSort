public static void qsort(int[] larik, int indexMulai, int indexAkhir) {
    if (indexAkhir <= indexMulai || indexMulai >= indexAkhir) {
        return;
    } else {
        int pivot = larik[indexMulai];
        int i = indexMulai + 1;
        int sementara;

        // Partisi array
        for (int j = indexMulai; j <= indexAkhir; j++) {
            if (pivot > larik[j]) {
                sementara = larik[j];
                larik[j] = larik[i];
                larik[i] = sementara;
                i++;
            }
        }

        // Memindahkan pivot ke posisi yang benar
        larik[indexMulai] = larik[i - 1];
        larik[i - 1] = pivot;

        // Rekursif qsort sebelah kiri dan kanan pivot
        qsort(larik, indexMulai, i - 2);
        qsort(larik, i, indexAkhir);
    }
}
