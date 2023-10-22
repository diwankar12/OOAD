package LLDQuestions.ParkingLot.model;

public enum ParkingSlotType {
      TwoWheeler{
          @Override
          public double getPriceForParking(double duration) {
              return duration *0.05 ;
          }
      },
    Compact{
        @Override
        public double getPriceForParking(double duration) {
            return duration *0.075 ;
        }

    },Medium{
        @Override
        public double getPriceForParking(double duration) {
            return duration *0.09 ;
        }
    },large{
        @Override
        public double getPriceForParking(double duration) {
            return duration *0.10 ;
        }
    };

      public abstract double getPriceForParking(double duration) ;

}
