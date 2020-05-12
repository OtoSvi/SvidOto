package svider.oto;

import static org.mockito.BDDMockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import svider.oto.dto.BacanatorDtoOutput;
import svider.oto.service.BacanatorService;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { BacanatorService.class, BacanatorDtoOutput.class})
public class BacanatorApplicationTests {

	@MockBean
	BacanatorService bacanatorService;
	
	@Autowired
	BacanatorDtoOutput bacanatorDtoOutput;
	
	@Test
	public void tryStart() {

		long trystart = 10;

		bacanatorDtoOutput.setStart(trystart);
		Mockito.when(bacanatorService.bacanatorServiceMethod(anyInt())).thenReturn(bacanatorDtoOutput);

		final BacanatorDtoOutput bacanatorOut = bacanatorService.bacanatorServiceMethod(5);

		assertEquals(trystart, bacanatorOut.getStart());
	}

	
}
