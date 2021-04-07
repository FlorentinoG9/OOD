package Assignment_5;

public class Car implements ITaxable {

  /** Init the varibales for the Car Object */
  private String make;
  private String model;
  private int engineSize;

  /**
   * Init the constructor by passing the arguments and then set those parameters
   * with the setters in the local variables of the object
   */
  /** Constructor */
  Car(String make, String model, int engineSize) {
    setEngineSize(engineSize);
    setMake(make);
    setModel(model);
  }

  /** Setters */
  public void setEngineSize(int engineSize) {
    this.engineSize = engineSize;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public void setModel(String model) {
    this.model = model;
  }

  /** Getters */
  public int getEngineSize() {
    return engineSize;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  @Override
  public double calculateTax() {

    /** If the engine size is less than 1000 will return 200 */
    if (engineSize < 1000) {
      return 200;
      /** if the engine size is between 1000 and 2000 will return 900 */
    } else if (engineSize >= 1000 && engineSize <= 2000) {
      return 900;
      /** if the engine size is greater than 2000 will return 1800 */
    } else if (engineSize > 2000) {
      return 1800;
    }

    return 0;
  }

  @Override
  public void printTax() {
    System.out.printf("The maker: %s\n", getMake());
    System.out.printf("The model: %s\n", getModel());
    System.out.printf("The Engine Size: %d\n", getEngineSize());
    System.out.printf("The Tax: %.2f\n", calculateTax());

  }

}
