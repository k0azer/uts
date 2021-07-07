interface InterfaceAC{
    public static final int KeadaanHidup = 1;
    public static final int KeadaanMati = 0;

    public static final int suhuACAwal = 25;
    public static final int suhuACMin = 16;
    public static final int suhuACMax = 32;

    public abstract void hidupkanAC();
    public abstract void matikanAC();
    public abstract void dinginkanAC(int suhu);
    public abstract void panaskanAC(int suhu);
}