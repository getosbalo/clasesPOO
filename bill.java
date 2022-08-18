public class bill {
    private int n = 0;
    private int k = 0;
    private int code;
    private double totalPrice;
    private String productsName[] = new String[n];
    private int productsCode[] = new int[k];
    private waiter MyWaiter;

    public bill (double newTotalPrice,int NewCode, waiter newWaiter, String NewProductsName, int NewProductCode) {
        this.productsCode[n] = NewProductCode;
        this.productsName[n] = NewProductsName;
        this.MyWaiter = newWaiter;
        this.totalPrice = newTotalPrice;
        this.code = NewCode;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public void setProductPrice(double newProductPrice) {
        this.totalPrice = newProductPrice;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int NewCode) {
        this.code = NewCode;
    }

    public waiter getWaiter(){
        return this.MyWaiter;
    }

    public void setWaiter(waiter newWaiter ){
        this.MyWaiter = newWaiter;
    }

    public String getProductName(int x){
        if(x<=n)
        return this.productsName[x];
        return null;
    }

    public void setProductName(String newProductName){
        this.productsName[n] = newProductName;
        n++;
    }

    public int getProductCode(int x){
        if(x<=k)
        return this.productsCode[x];
        return 0;
    }

    public void setProductCode(int NewCode){
        this.productsCode[k] = NewCode;
        k++;
    }




}
