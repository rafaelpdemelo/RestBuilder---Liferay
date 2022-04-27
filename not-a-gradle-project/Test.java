import com.acme.headless.r3b2.client.dto.v1_0.Foo;
import com.acme.headless.r3b2.client.resource.v1_0.FooResource;
import com.acme.headless.r3b2.client.dto.v1_0.Goo;
import com.acme.headless.r3b2.client.resource.v1_0.GooResource;

public class Test {


	public static Goo gooConstructor(Long id, String name, String description){
		Goo newGoo = new Goo();
		newGoo.setId(id);
		newGoo.setName(name);
		newGoo.setDescription(description);

		return newGoo;
	}

	public static Foo fooConstructor(Long id, String name, String description){
		
		Foo newFoo = new Foo();
		newFoo.setId(id);
		newFoo.setDescription(name);
		newFoo.setName(description);

		return newFoo;
	}





	public static void main(String[] args) throws Exception {
		FooResource.Builder builder = FooResource.builder();

		FooResource fooResource = builder.authentication(
			"test@liferay.com", "test"
		).build();

		GooResource.builder gooBuilder = GooResource.builder();

		GooResource gooResource = gooBuilder.authentication(
			"test@liferay.com", "test"
		).build();


		
		Foo foo = fooResource.getFoo(1L);
		System.out.println(foo);

		Goo goo = gooBuilder.getGoo(1L);
		System.out.println(goo);


		Foo fooPostObject = fooConstructor(123L, "TesteName", "TestDescription");
		System.out.println(fooResource.fooPost(fooPostObject));

		Goo GooPostObject = gooConstructor(123L, "TesteName", "TestDescription");
		System.out.println(gooResource.gooPost(gooPostObject));

		Foo fooPutObject = fooConstructor(123L, "TesteName", "TestDescription");
		System.out.println(fooResource.putFoo(fooPutObject));

		Goo GooPutObject = gooConstructor(123L, "TesteName", "TestDescription");
		System.out.println(gooResource.putGoo(gooPostObject));


		gooResource.deleteGoo(123L);
		fooResource.deleteFoo(123L);




		

		// Foo fooPost = fooResource.postFoo(newFoo);
		// Long fooId = fooPost.getId();
		// System.out.println(fooPost);


		// Foo fooPut = fooPost;
		// fooPut.setDescription("TESTE2");

		// fooResource.putFoo(fooId, fooPut);


		// Foo fooPatch = new Foo();

		// fooPatch.setDescription("TESTE3PATCH");
		
		// fooResource.patchFoo(fooId, fooPatch);

		// fooResource.deleteFoo(fooId);








		

		
	}

}