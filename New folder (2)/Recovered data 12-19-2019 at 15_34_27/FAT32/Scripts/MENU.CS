using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;


public class MENU : MonoBehaviour
{

    public int level;
    // Start is called before the first frame update
    public void mainM()
    {
        SceneManager.LoadScene("MainMenuThree", LoadSceneMode.Additive);
    }



    public void game()
    {
        SceneManager.LoadScene("SampleScene", LoadSceneMode.Additive);
    }
    // Update is called once per frame
    void Update()
    {
        
    }

    public void LoadScene()
    {
        Application.LoadLevel(level);
    }
}
