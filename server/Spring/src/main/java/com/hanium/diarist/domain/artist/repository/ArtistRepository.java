package com.hanium.diarist.domain.artist.repository;

import com.hanium.diarist.domain.artist.domain.Artist;
import com.hanium.diarist.domain.artist.domain.Period;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ArtistRepository extends JpaRepository<Artist, Long> {

    List<Artist> findAllByPeriod(Period period);

    Optional<Artist> findByArtistId(Long artistId);
}
