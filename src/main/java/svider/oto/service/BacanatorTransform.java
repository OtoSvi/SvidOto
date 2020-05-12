package svider.oto.service;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import svider.oto.connector.ConnectionOfInput;
import svider.oto.dto.BacanatorDtoItem;
import java.time.Duration;

@Component
@Scope("prototype")
public class BacanatorTransform {
	@Autowired
	ConnectionOfInput connectionOfInput;
	BacanatorDtoItem bacanatorDtoItem;

	@Lookup
	public BacanatorDtoItem getBacanatorDtoItem() {
		return null;
	}

	public BacanatorDtoItem bacanatorTransformMethod() {
		bacanatorDtoItem = this.getBacanatorDtoItem();
		bacanatorDtoItem.setStart(Instant.now().getEpochSecond());
		bacanatorDtoItem.setData(connectionOfInput.connectionOfInput());
		bacanatorDtoItem.setEnd(Instant.now().getEpochSecond());
		bacanatorDtoItem.setDuration(Duration.ofMillis(bacanatorDtoItem.getEnd() - bacanatorDtoItem.getStart()));
		return bacanatorDtoItem;
	}

}
