package andrianopasquale97.U5W2D22;

import andrianopasquale97.U5W2D22.entities.BlogPost;
import andrianopasquale97.U5W2D22.services.BlogPostService;
import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Supplier;

@SpringBootApplication
public class U5W2D22Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W2D22Application.class, args);
		Faker faker= new Faker();
		BlogPostService blogPostService= new BlogPostService();
		Supplier<BlogPost> supplier = () -> new BlogPost(faker.random().nextInt(111111111),faker.music().genre(),
				faker.lorem().sentence(),
				faker.internet().url(),
				faker.lorem().paragraph(),
				faker.number().numberBetween(1, 100));

//		for (int i = 0; i < 10; i++) {
//			BlogPost blogPost = supplier.get();
//			            System.out.println(blogPost);
//
//			blogPostService.saveBlogPost(blogPost);
//
//		}
//		System.out.println(blogPostService.getBlogPostList());
	}

}
