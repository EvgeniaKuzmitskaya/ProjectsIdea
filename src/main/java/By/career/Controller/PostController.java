package By.career.Controller;



import By.career.Model.Post;
import By.career.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Evgenia on 18.04.2017.
 */
@Controller
public class PostController {

    @Autowired(required = true)
    private PostService postService;

    @Qualifier(value = "postService")
    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping(value = "/postAdd", method = RequestMethod.GET)
    public String addPosts(@ModelAttribute ("pos") Post post){
        return "postAdd";
    }

    @RequestMapping(value = "/postAdd", method = RequestMethod.POST)
    public String add(@ModelAttribute("pos")Post post){
       System.out.println("post="+post);
       this.postService.addPost(post);
        return "postAdd";
    }




}
