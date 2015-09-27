package eu.kanade.mangafeed;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import eu.kanade.mangafeed.data.DataModule;
import eu.kanade.mangafeed.presenter.LibraryPresenter;
import eu.kanade.mangafeed.ui.activity.MainActivity;
import eu.kanade.mangafeed.ui.activity.MangaDetailActivity;
import eu.kanade.mangafeed.ui.fragment.LibraryFragment;

@Singleton
@Component(
        modules = {
                AppModule.class,
                DataModule.class
        }
)
public interface AppComponent {

    void inject(MainActivity mainActivity);
    void inject(LibraryPresenter libraryPresenter);
    void inject(MangaDetailActivity mangaDetailActivity);

    Application application();
}