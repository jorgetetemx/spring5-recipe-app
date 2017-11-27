package guru.springframework.commands;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

import guru.springframework.domain.Difficulty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by jt on 6/21/17.
 */
@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand {
    private Long id;
    
    @NotBlank
    @Length(min=3, max=255)
    private String description;
    
    @Max(value=1000)
    @Min(value=1)
    private Integer prepTime;
    
    @Max(value=800)
    @Min(value=1)
    private Integer cookTime;
    
    @Max(value=100)
    @Min(value=1)
    private Integer servings;
    
    @NotBlank
    private String source;
    
    @URL
    @NotBlank
    private String url;
    
    @NotBlank
    private String directions;
    
    private Set<IngredientCommand> ingredients = new HashSet<>();
    private Byte[] image;
    private Difficulty difficulty;
    private NotesCommand notes;
    private Set<CategoryCommand> categories = new HashSet<>();
}