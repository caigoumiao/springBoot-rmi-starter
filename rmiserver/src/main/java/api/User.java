package api;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable
{
    private static final long serialVersionUID = 7323661722446079639L;
    private int age;
    private String name;
    private Date birth;
}
