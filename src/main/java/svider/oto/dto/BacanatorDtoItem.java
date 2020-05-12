package svider.oto.dto;

import java.time.Duration;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
@Scope("prototype")
public class BacanatorDtoItem {
	private long start;
	private long end;
	private Duration duration;
	private String data;
}
