package br.com.automatodev.repository;

import br.com.automatodev.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

    default Tweet create(Tweet tweet) {

        return this.save(tweet);
    }

    default void deleteTweet(Long tweetId) {

        this.deleteById(tweetId);
    }

    default Tweet update(Tweet tweet) {

        return this.save(tweet);
    }

    default Optional<Tweet> fetechById(Long id) {

        return this.findById(id);
    }
}
