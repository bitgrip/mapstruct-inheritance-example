package de.bitgrip.mapstruct.example.model.source;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * <p>TODO Document!</p>
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
@Data
@ToString(callSuper = true)
public class Car extends Vehicle {

  private String roof;

  @Builder
  public Car(String roof, Break mainBreak, String id, List<String> transportationObjects,
             Integer weight, Length width,
             Length height, Length length) {
    super(mainBreak, id, transportationObjects, weight, width, height, length);
    this.roof = roof;
  }
}
