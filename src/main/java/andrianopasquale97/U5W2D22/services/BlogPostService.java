package andrianopasquale97.U5W2D22.services;

import andrianopasquale97.U5W2D22.entities.BlogPost;
import andrianopasquale97.U5W2D22.exepitions.NotFoundExcepition;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Getter
@Service
public class BlogPostService {

    private List<BlogPost> blogPostList = new ArrayList<>();

    public BlogPost saveBlogPost(BlogPost blogPost) {
        Random random = new Random();
        blogPost.setId(random.nextInt(1000000));
        blogPostList.add(blogPost);
        return blogPost;
    }

    public BlogPost getSingleBlogPost(int id) {
        BlogPost found = null;
        for (BlogPost blogPost : this.blogPostList) {
            if (blogPost.getId() == id) {
                found = blogPost;

            }
        }
        if (found == null) {
            throw new NotFoundExcepition(id);
        } else {
            return found;
        }

    }

    public BlogPost updateBlogPost(int id, BlogPost updatedDBlogPost) {
        BlogPost found = null;
        for (BlogPost blogPost1 : this.blogPostList) {
            if (blogPost1.getId() == id) {
                found = blogPost1;
                found.setCategoria(updatedDBlogPost.getCategoria());
                found.setTitolo(updatedDBlogPost.getTitolo());
                found.setCover(updatedDBlogPost.getCover());
                found.setContenuto(updatedDBlogPost.getContenuto());
                found.setTempoDiLettura(updatedDBlogPost.getTempoDiLettura());

                break;
            }
        }
        if (found == null) {
            throw new NotFoundExcepition(id);
        } else {
            return found;
        }


    }



    public void findByIdAndDelete(int id){
        Iterator<BlogPost> iterator = this.blogPostList.iterator();

        while(iterator.hasNext()){
            BlogPost current = iterator.next();
            if(current.getId() == id){
                iterator.remove();
            }}
}}




