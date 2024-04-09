package andrianopasquale97.U5W2D22.controllers;


import andrianopasquale97.U5W2D22.entities.BlogPost;
import andrianopasquale97.U5W2D22.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/blogposts")
public class BlogPostController {
    @Autowired
    private BlogPostService blogpostService;

    @GetMapping
    private List<BlogPost> getBlogPostList() {
        return this.blogpostService.getBlogPostList();
    }

    @GetMapping("/{blogPostId}")
    private BlogPost getSingleBlogPost(int blogPostId) {
        return this.blogpostService.getSingleBlogPost(blogPostId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private BlogPost saveBlogPost(BlogPost blogPost) {
        return this.blogpostService.saveBlogPost(blogPost);
    }

    @PutMapping("/{blogPostId}")
    private BlogPost updateBlogPost(int blogPostId, BlogPost updatedBlogPost) {
        return this.blogpostService.updateBlogPost(blogPostId, updatedBlogPost);
    }

    @DeleteMapping("/{blogPostId}")
    private void deleteBlogPost(int blogPostId) {
        this.blogpostService.findByIdAndDelete(blogPostId);
    }




}
