package svider.oto.service;

import java.time.Instant;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import svider.oto.dto.BacanatorDtoItem;
import svider.oto.dto.BacanatorDtoOutput;
import java.util.UUID;

@Service
public class BacanatorService {

	@Autowired
	BacanatorDtoOutput bacanatorDtoOutput;
	BacanatorTransform bacanatorTransform;
	ArrayList<BacanatorDtoItem> bacanatorServiceArrayList;

	@Lookup
	public BacanatorTransform getBacanatorTransform() {
		return null;
	}

	public BacanatorDtoOutput bacanatorServiceMethod(int howmuch) {
		bacanatorServiceArrayList = new ArrayList<BacanatorDtoItem>();
		bacanatorDtoOutput.setStart(Instant.now().getEpochSecond());
		bacanatorDtoOutput.setRunld(UUID.randomUUID().toString().substring(0, 5));

		for (int i = 0; i < howmuch; i++) {
			bacanatorServiceArrayList.add(getBacanatorTransform().bacanatorTransformMethod());
			bacanatorDtoOutput.setItems(bacanatorServiceArrayList);
			bacanatorDtoOutput.setEnd(Instant.now().getEpochSecond());
		}
		return bacanatorDtoOutput;
	}
}
