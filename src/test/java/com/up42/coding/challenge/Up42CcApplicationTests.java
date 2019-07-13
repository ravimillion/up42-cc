package com.up42.coding.challenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.up42.coding.challenge.service.FeatureDef;
import com.up42.coding.challenge.service.FeatureService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = FeatureController.class)
public class Up42CcApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private FeatureService featureService;

	@Test
	public void contextLoads() {

	}

	FeatureDef fakeFeatureDef = new FeatureDef("0b598c52-7bf2-4df0-9d09-94229cdfbc0b", "Sentinel-1A", 1560661222337l,
			1560661222337l, 1560661247336l);

	@Test
	public void testFeaturesList() {
		Mockito.when(featureService.getFeature(Mockito.anyString())).thenReturn(fakeFeatureDef);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/features/0b598c52-7bf2-4df0-9d09-94229cdfbc0b")
				.accept(MediaType.APPLICATION_JSON);
		MvcResult result;
		try {
			result = mockMvc.perform(requestBuilder).andReturn();
			// check the returned JSON response
			JSONAssert.assertEquals(
					"{\"id\":\"0b598c52-7bf2-4df0-9d09-94229cdfbc0b\",\"missionName\":\"Sentinel-1A\",\"timestamp\":1560661222337,\"beginViewingDate\":1560661222337,\"endViewingDate\":1560661247336}",
					result.getResponse().getContentAsString(), false);
			// check the status code
			assertEquals(HttpStatus.OK.value(), result.getResponse().getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
