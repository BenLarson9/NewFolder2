using UnityEngine.UI;
using UnityEngine;

public class Coin : MonoBehaviour
{
    public Text text;
    public static int StartingScore;
    public static float PowerIncrease = 1f;

    public void OnCollisionEnter(Collision col)
    {
        if (col.collider.tag == "Coin")
        {
            Destroy(col.collider.gameObject);
            StartingScore += 1;
        }
        if (col.collider.tag == "PowerCube")
        {
            Destroy(col.collider.gameObject);
            MainPlayerMovement.fowardForce += PowerIncrease;
            MainPlayerMovement.sidewaysForce += PowerIncrease;
        }
    }
    void Update()
    {
        text.text = "Score: " + StartingScore;
        if (StartingScore >= 25)
        {
            GetComponent<MainPlayerMovement>().enabled = false;

            Application.LoadLevel(2);

        }

    }

}