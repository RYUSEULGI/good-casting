package shop.goodcasting.api.article.profile.domain;

import lombok.Getter;
import shop.goodcasting.api.board.job.domain.Job;
import shop.goodcasting.api.common.domain.BaseEntity;
import shop.goodcasting.api.common.domain.HireProfile;
import shop.goodcasting.api.file.video.domain.Video;
import shop.goodcasting.api.user.actor.domain.Actor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "profiles")
public class Profile extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "profile_id")
    private long profileId;

    @Column boolean privacy;
    @Column String contents;
    @Column private String career;

    @ManyToOne
    @JoinColumn(name = "actor_id")
    private Actor actor;

    @OneToOne(mappedBy = "profile")
    private Video video;

    @OneToMany(mappedBy = "profile")
    private List<HireProfile> hires = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "job_board_id")
    private Job job;
}