package Assignment_5;

public class Car implements ITaxable {

  private String make;
  private String model;
  private int engineSize;

  Car(String make, String model, int engineSize){
    setEngineSize(engineSize);
    setMake(make);
    setModel(model);
  }

  public void setEngineSize(int engineSize) {
    this.engineSize = engineSize;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public void setModel(String model) {
    this.model = model;
  }

  @Override
  public double calculateTax() {

    if (engineSize < 1000) {
      return 200;
    } else if (engineSize >= 1000 && engineSize <= 2000) {
      return 900;
    } else if (engineSize > 2000) {
      return 1800;
    }

    return 0;
  }

  @Override
  public void printTax() {
    System.out.printf("The maker: %s\n", make);
    System.out.printf("The model: %s\n", model);
    System.out.printf("The Engine Size: %d\n", engineSize);
    System.out.printf("The Tax: %.2f\n", calculateTax());
    
  }

}
