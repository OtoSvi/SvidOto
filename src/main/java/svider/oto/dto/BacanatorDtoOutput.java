package svider.oto.dto;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
public class BacanatorDtoOutput {
	private String runld;
	private long start;
	private long end;
	private ArrayList<BacanatorDtoItem> items;
}
