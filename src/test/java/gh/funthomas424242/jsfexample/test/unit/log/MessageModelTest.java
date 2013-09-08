package gh.funthomas424242.jsfexample.test.unit.log;

import static org.junit.Assert.assertEquals;
import gh.funthomas424242.jsfexample.log.MessageModel;
import gh.funthomas424242.jsfexample.test.unit.UnitTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(UnitTest.class)
public class MessageModelTest {

	@Test
	public void testGetSet() {

		MessageModel model = new MessageModel();
		model.setNewValue("blah");
		assertEquals("blah", model.getNewValue());

	}
}
